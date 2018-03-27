import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ServiceImplement implements CreateHTML {
    private PersonalData personalData;

    public ServiceImplement(String propertyFilePath){
        DataAcquitision dataAcquitision = new PersonRepositoryFromPropertieFile(
                getClass().getClassLoader().getResourceAsStream(propertyFilePath)
        );
        this.personalData = dataAcquitision.getPersonalData();
    }
    public void generation(String pathFileHtml){
        if (this.personalData != null){
            String print = "<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    " <head>\n" +
                    "  <meta charset=utf-8\">\n" +
                    "  <title>Пример веб-страницы</title>\n" +
                    "   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                    "  <style>\n" +
                    "\t<div class=\"container\">\n" +
                    "\t\twight = 50%;\n" +
                    "\t</div>\n" +
                    "  \n" +
                    "  </style>\n" +
                    " </head>\n" +
                    " <body>\n" +
                    " <div class=\"container\"> <font size=\"4\">\n" +
                    "  <div class=\"row\">\n" +
                    "  <div class=\"col-xs-12\"><center><h1>Резюме</h1> <h4>на должность Java-стажёр </h4><center></div>\n" +
                    "\t<div class=\"col-xs-2\" align=\"right\">\n" +
                    "\tФИО:\n" +
                    "\t<br>Дата рождения:\n" +
                    "\t<br>Телефон:\n" +
                    "\t<br>e-mail:\n" +
                    "\t<br>Skype: <br></div>\n" +
                    "\t<div class=\"col-xs-7\">" + personalData.getFio()+ "<br>" + personalData.getDob() + "<br>" + personalData.getTelefon() + "<br>" + personalData.getEmail() + "<br>" + personalData.getSkype() + "</div>\n" +
                    "\t<div class=\"col-xs-3\"><img src=\"" + personalData.getAvatar() + "\" width=\"250\" height=\"200\" alt=\"avatar\" class=\"img-rounded\" ></div>\n" +
                    "\t<div class=\"clearfix\"><b>Цель:</b></div> \n" +
                    "\t<div class=\"clearfix\">" + personalData.getTarget() + "</div> \n" +
                    "\t<div class=\"clearfix\"><b>Опыт работы:</b></div>\n" +
                    "\t<div class=\"clearfix\">\n" +
                    "\t\t<ol>\n" +
                    "\t\t\t" + personalData.getExperience() + "\n" +
                    "\t\t</ol>\n" +
                    "\t</div>\t\n" +
                    "\t<div class=\"clearfix\"><b>Образование:</b></div>\n" +
                    "\t<div class=\"clearfix\">" + personalData.getEducation() + "</div> \n" +
                    "\t<div class=\"clearfix\"><b>Дополнительное образование и курсы:</b></div> \n" +
                    "\t<div class=\"clearfix\"><ol>\n" +
                    "\t\t\t" + personalData.getPlus_education() + "\n" +
                    "\t\t</ol></div>\n" +
                    "<div class=\"clearfix\"><b>Навыки:</b></div> \t\n" +
                    "\t<div class=\"clearfix\"><ol>\n" +
                    "\t\t\t" + personalData.getSkils() + "\n" +
                    "\t\t</ol>\n" +
                    "\t</div>\n" +
                    "\t<div class=\"clearfix\"><b>Пример моего кода:</b></div> \t\n" +
                    "\t<div class=\"clearfix\">" + personalData.getPrev() + "</div>"+
                    "  </font></div>\n" +
                    "</div>\n" +
                    " \n" +
                    "  \n" +
                    " </body>\n" +
                    "</html>";
            try {
                File file = new File(pathFileHtml);
                if (!file.exists()) {
                    file.createNewFile();

                }
                FileWriter writer = new FileWriter(pathFileHtml, false);
                writer.write(print);
                writer.flush();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
