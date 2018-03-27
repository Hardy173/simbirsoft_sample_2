import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class PersonRepositoryFromPropertieFile implements DataAcquitision{
    private Properties personDataFiles;

    public PersonRepositoryFromPropertieFile(InputStream configFileInput){
        this.personDataFiles = getPropeties(configFileInput);
    }

    private Properties getPropeties(InputStream configFileInput) {
        Properties property = new Properties();
        try {
            property.load(new InputStreamReader(configFileInput, Charset.forName("UTF-8")));
            return property;
        } catch (FileNotFoundException e) {
            System.out.println("Файл bd.properties не найден");
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PersonalData getPersonalData() {
        PersonalData personalData = null;
        if (this.personDataFiles != null){
            personalData = new PersonalData(
                    personDataFiles.getProperty(PersonalPropertyInformaton.fio),
                    personDataFiles.getProperty(PersonalPropertyInformaton.dob),
                    personDataFiles.getProperty(PersonalPropertyInformaton.telefon),
                    personDataFiles.getProperty(PersonalPropertyInformaton.email),
                    personDataFiles.getProperty(PersonalPropertyInformaton.skype),
                    personDataFiles.getProperty(PersonalPropertyInformaton.avatar),
                    personDataFiles.getProperty(PersonalPropertyInformaton.target),
                    personDataFiles.getProperty(PersonalPropertyInformaton.experience),
                    personDataFiles.getProperty(PersonalPropertyInformaton.education),
                    personDataFiles.getProperty(PersonalPropertyInformaton.plus_education),
                    personDataFiles.getProperty(PersonalPropertyInformaton.skils),
                    personDataFiles.getProperty(PersonalPropertyInformaton.prev)
            );
        }
        return personalData;
    }
}