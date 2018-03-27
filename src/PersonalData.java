public class PersonalData {
    private String fio;
    private String dob;
    private String telefon;
    private String email;
    private String skype;
    private String avatar;
    private String target;
    private String experience;
    private String education;
    private String plus_education;
    private String skils;
    private String prev;

    public PersonalData(
            /*Свойство: Фамилия Имя Отчество*/
            String fio,
            /*Свойство: Дата рождения*/
            String dob,
            /*Свойство: Телефон*/
            String telefon,
            /*Свойство: Адрес электронной почты*/
            String email,
            /*Свойство: Логин в скайпе*/
            String skype,
            /*Свойство: Сссылка на аватарку*/
            String avatar,
            /*Свойство: Причина написания резюме*/
            String target,
            /*Свойство: Опыт работы*/
            String experience,
            /*Свойство: Образование*/
            String education,
            /*Свойство: Дополнительное образование*/
            String plus_education,
            /*Свойство: Навыки и умения*/
            String skils,
            /*Свойство: Ссылка на мой код на GitHub*/
            String prev
    ){
        this.fio = fio;
        this.dob = dob;
        this.telefon = telefon;
        this.email = email;
        this.skype = skype;
        this.avatar = avatar;
        this.target = target;
        this.experience = experience;
        this.plus_education = plus_education;
        this.skils = skils;
        this.prev = prev;
        this.education = education;
    }
    /*Геттерны и сеттерны:*/

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }



    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }


    public String getSkils() {
        return skils;
    }

    public void setSkils(String skils) {
        this.skils = skils;
    }


    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }


    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


    public String getPlus_education() {
        return plus_education;
    }

    public void setPlus_education(String plus_education) {
        this.plus_education = plus_education;
    }


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


}
