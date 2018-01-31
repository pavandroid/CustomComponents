package com.arch.sample.customcomponents.customviews;

import java.util.List;

/**
 * Created by pavan on 12/14/2017.
 */

public class Model {

    @com.google.gson.annotations.SerializedName("aboutmeData")
    private Aboutmedata aboutmedata;
    @com.google.gson.annotations.SerializedName("appearanceData")
    private Appearancedata appearancedata;
    @com.google.gson.annotations.SerializedName("lifeStyleData")
    private Lifestyledata lifestyledata;
    @com.google.gson.annotations.SerializedName("ptData")
    private List<Ptdata> ptdata;
    @com.google.gson.annotations.SerializedName("hbyData")
    private List<Hbydata> hbydata;

    public Aboutmedata getAboutmedata() {
        return aboutmedata;
    }

    public void setAboutmedata(Aboutmedata aboutmedata) {
        this.aboutmedata = aboutmedata;
    }

    public Appearancedata getAppearancedata() {
        return appearancedata;
    }

    public void setAppearancedata(Appearancedata appearancedata) {
        this.appearancedata = appearancedata;
    }

    public Lifestyledata getLifestyledata() {
        return lifestyledata;
    }

    public void setLifestyledata(Lifestyledata lifestyledata) {
        this.lifestyledata = lifestyledata;
    }

    public List<Ptdata> getPtdata() {
        return ptdata;
    }

    public void setPtdata(List<Ptdata> ptdata) {
        this.ptdata = ptdata;
    }

    public List<Hbydata> getHbydata() {
        return hbydata;
    }

    public void setHbydata(List<Hbydata> hbydata) {
        this.hbydata = hbydata;
    }

    public static class Ethnicity {
        @com.google.gson.annotations.SerializedName("ethnicityId")
        private int ethnicityid;
        @com.google.gson.annotations.SerializedName("ethnicityName")
        private String ethnicityname;

        public int getEthnicityid() {
            return ethnicityid;
        }

        public void setEthnicityid(int ethnicityid) {
            this.ethnicityid = ethnicityid;
        }

        public String getEthnicityname() {
            return ethnicityname;
        }

        public void setEthnicityname(String ethnicityname) {
            this.ethnicityname = ethnicityname;
        }
    }

    public static class Religion {
        @com.google.gson.annotations.SerializedName("religionId")
        private int religionid;
        @com.google.gson.annotations.SerializedName("religionName")
        private String religionname;

        public int getReligionid() {
            return religionid;
        }

        public void setReligionid(int religionid) {
            this.religionid = religionid;
        }

        public String getReligionname() {
            return religionname;
        }

        public void setReligionname(String religionname) {
            this.religionname = religionname;
        }
    }

    public static class Areaofwork {
        @com.google.gson.annotations.SerializedName("awId")
        private int awid;
        @com.google.gson.annotations.SerializedName("awName")
        private String awname;

        public int getAwid() {
            return awid;
        }

        public void setAwid(int awid) {
            this.awid = awid;
        }

        public String getAwname() {
            return awname;
        }

        public void setAwname(String awname) {
            this.awname = awname;
        }
    }

    public static class Status {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Degree {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Countries {
        @com.google.gson.annotations.SerializedName("countryId")
        private int countryid;
        @com.google.gson.annotations.SerializedName("countryName")
        private String countryname;
        @com.google.gson.annotations.SerializedName("countryCode")
        private String countrycode;
        @com.google.gson.annotations.SerializedName("countryShortName")
        private String countryshortname;
        @com.google.gson.annotations.SerializedName("priority")
        private int priority;

        public int getCountryid() {
            return countryid;
        }

        public void setCountryid(int countryid) {
            this.countryid = countryid;
        }

        public String getCountryname() {
            return countryname;
        }

        public void setCountryname(String countryname) {
            this.countryname = countryname;
        }

        public String getCountrycode() {
            return countrycode;
        }

        public void setCountrycode(String countrycode) {
            this.countrycode = countrycode;
        }

        public String getCountryshortname() {
            return countryshortname;
        }

        public void setCountryshortname(String countryshortname) {
            this.countryshortname = countryshortname;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }

    public static class Aboutmedata {
        @com.google.gson.annotations.SerializedName("Ethnicity")
        private List<Ethnicity> ethnicity;
        @com.google.gson.annotations.SerializedName("Religion")
        private List<Religion> religion;
        @com.google.gson.annotations.SerializedName("AreaOfWork")
        private List<Areaofwork> areaofwork;
        @com.google.gson.annotations.SerializedName("Status")
        private List<Status> status;
        @com.google.gson.annotations.SerializedName("Degree")
        private List<Degree> degree;
        @com.google.gson.annotations.SerializedName("Countries")
        private List<Countries> countries;
        @com.google.gson.annotations.SerializedName("States")
        private String states;
        @com.google.gson.annotations.SerializedName("Cities")
        private String cities;

        public List<Ethnicity> getEthnicity() {
            return ethnicity;
        }

        public void setEthnicity(List<Ethnicity> ethnicity) {
            this.ethnicity = ethnicity;
        }

        public List<Religion> getReligion() {
            return religion;
        }

        public void setReligion(List<Religion> religion) {
            this.religion = religion;
        }

        public List<Areaofwork> getAreaofwork() {
            return areaofwork;
        }

        public void setAreaofwork(List<Areaofwork> areaofwork) {
            this.areaofwork = areaofwork;
        }

        public List<Status> getStatus() {
            return status;
        }

        public void setStatus(List<Status> status) {
            this.status = status;
        }

        public List<Degree> getDegree() {
            return degree;
        }

        public void setDegree(List<Degree> degree) {
            this.degree = degree;
        }

        public List<Countries> getCountries() {
            return countries;
        }

        public void setCountries(List<Countries> countries) {
            this.countries = countries;
        }

        public String getStates() {
            return states;
        }

        public void setStates(String states) {
            this.states = states;
        }

        public String getCities() {
            return cities;
        }

        public void setCities(String cities) {
            this.cities = cities;
        }
    }

    public static class Build {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Height {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Eyecolor {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Haircolor {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Appearancedata {
        @com.google.gson.annotations.SerializedName("build")
        private List<Build> build;
        @com.google.gson.annotations.SerializedName("height")
        private List<Height> height;
        @com.google.gson.annotations.SerializedName("eyecolor")
        private List<Eyecolor> eyecolor;
        @com.google.gson.annotations.SerializedName("haircolor")
        private List<Haircolor> haircolor;

        public List<Build> getBuild() {
            return build;
        }

        public void setBuild(List<Build> build) {
            this.build = build;
        }

        public List<Height> getHeight() {
            return height;
        }

        public void setHeight(List<Height> height) {
            this.height = height;
        }

        public List<Eyecolor> getEyecolor() {
            return eyecolor;
        }

        public void setEyecolor(List<Eyecolor> eyecolor) {
            this.eyecolor = eyecolor;
        }

        public List<Haircolor> getHaircolor() {
            return haircolor;
        }

        public void setHaircolor(List<Haircolor> haircolor) {
            this.haircolor = haircolor;
        }
    }

    public static class Diet {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Smoke {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Drink {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Idealrelationship {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Numofchildren {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Childrenpref {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Numofpets {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Petpref {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Language {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Religious {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Traditional {
        @com.google.gson.annotations.SerializedName("val")
        private int val;
        @com.google.gson.annotations.SerializedName("txt")
        private String txt;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }

    public static class Lifestyledata {
        @com.google.gson.annotations.SerializedName("diet")
        private List<Diet> diet;
        @com.google.gson.annotations.SerializedName("smoke")
        private List<Smoke> smoke;
        @com.google.gson.annotations.SerializedName("drink")
        private List<Drink> drink;
        @com.google.gson.annotations.SerializedName("IdealRelationShip")
        private List<Idealrelationship> idealrelationship;
        @com.google.gson.annotations.SerializedName("numOfChildren")
        private List<Numofchildren> numofchildren;
        @com.google.gson.annotations.SerializedName("childrenPref")
        private List<Childrenpref> childrenpref;
        @com.google.gson.annotations.SerializedName("numOfPets")
        private List<Numofpets> numofpets;
        @com.google.gson.annotations.SerializedName("petPref")
        private List<Petpref> petpref;
        @com.google.gson.annotations.SerializedName("language")
        private List<Language> language;
        @com.google.gson.annotations.SerializedName("Religious")
        private List<Religious> religious;
        @com.google.gson.annotations.SerializedName("traditional")
        private List<Traditional> traditional;

        public List<Diet> getDiet() {
            return diet;
        }

        public void setDiet(List<Diet> diet) {
            this.diet = diet;
        }

        public List<Smoke> getSmoke() {
            return smoke;
        }

        public void setSmoke(List<Smoke> smoke) {
            this.smoke = smoke;
        }

        public List<Drink> getDrink() {
            return drink;
        }

        public void setDrink(List<Drink> drink) {
            this.drink = drink;
        }

        public List<Idealrelationship> getIdealrelationship() {
            return idealrelationship;
        }

        public void setIdealrelationship(List<Idealrelationship> idealrelationship) {
            this.idealrelationship = idealrelationship;
        }

        public List<Numofchildren> getNumofchildren() {
            return numofchildren;
        }

        public void setNumofchildren(List<Numofchildren> numofchildren) {
            this.numofchildren = numofchildren;
        }

        public List<Childrenpref> getChildrenpref() {
            return childrenpref;
        }

        public void setChildrenpref(List<Childrenpref> childrenpref) {
            this.childrenpref = childrenpref;
        }

        public List<Numofpets> getNumofpets() {
            return numofpets;
        }

        public void setNumofpets(List<Numofpets> numofpets) {
            this.numofpets = numofpets;
        }

        public List<Petpref> getPetpref() {
            return petpref;
        }

        public void setPetpref(List<Petpref> petpref) {
            this.petpref = petpref;
        }

        public List<Language> getLanguage() {
            return language;
        }

        public void setLanguage(List<Language> language) {
            this.language = language;
        }

        public List<Religious> getReligious() {
            return religious;
        }

        public void setReligious(List<Religious> religious) {
            this.religious = religious;
        }

        public List<Traditional> getTraditional() {
            return traditional;
        }

        public void setTraditional(List<Traditional> traditional) {
            this.traditional = traditional;
        }
    }

    public static class Ptdata {
        @com.google.gson.annotations.SerializedName("ptId")
        private int ptid;
        @com.google.gson.annotations.SerializedName("personalityName")
        private String personalityname;
        @com.google.gson.annotations.SerializedName("ptcId")
        private int ptcid;
        @com.google.gson.annotations.SerializedName("iconImg")
        private String iconimg;

        public int getPtid() {
            return ptid;
        }

        public void setPtid(int ptid) {
            this.ptid = ptid;
        }

        public String getPersonalityname() {
            return personalityname;
        }

        public void setPersonalityname(String personalityname) {
            this.personalityname = personalityname;
        }

        public int getPtcid() {
            return ptcid;
        }

        public void setPtcid(int ptcid) {
            this.ptcid = ptcid;
        }

        public String getIconimg() {
            return iconimg;
        }

        public void setIconimg(String iconimg) {
            this.iconimg = iconimg;
        }
    }

    public static class Hbydata {
        @com.google.gson.annotations.SerializedName("HobbyId")
        private int hobbyid;
        @com.google.gson.annotations.SerializedName("HobbyName")
        private String hobbyname;
        @com.google.gson.annotations.SerializedName("HcId")
        private int hcid;
        @com.google.gson.annotations.SerializedName("categoryName")
        private String categoryname;

        public int getHobbyid() {
            return hobbyid;
        }

        public void setHobbyid(int hobbyid) {
            this.hobbyid = hobbyid;
        }

        public String getHobbyname() {
            return hobbyname;
        }

        public void setHobbyname(String hobbyname) {
            this.hobbyname = hobbyname;
        }

        public int getHcid() {
            return hcid;
        }

        public void setHcid(int hcid) {
            this.hcid = hcid;
        }

        public String getCategoryname() {
            return categoryname;
        }

        public void setCategoryname(String categoryname) {
            this.categoryname = categoryname;
        }
    }
}
