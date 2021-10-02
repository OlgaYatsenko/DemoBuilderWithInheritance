class SchoolChild extends Child{


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "SchoolChild{" +
                super.toString() +
                '}';
    }
}

class SchoolChildBuilder extends ChildBuilder<SchoolChildBuilder>{



    public  SchoolChildBuilder studyIn(String schoolName){
        child.schoolName=schoolName;
        return  self();
    }

    //public SchoolChild build(){return child;    }

    @Override
    public String toString() {
        return  child.toString();
    }

    @Override
    public SchoolChildBuilder self(){
        return this;
    }


}
