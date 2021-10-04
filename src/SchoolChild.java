class SchoolChild extends Child{
    protected SchoolChild(){};

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


    @Override
    public String toString() {
        return  child.toString();
    }

    @Override
    public SchoolChildBuilder self(){
        return this;
    }


}
