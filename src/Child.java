class Child{
    protected String name;
    protected String schoolName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}

class ChildBuilder<SELF extends ChildBuilder>{
    protected Child child=new Child();


    public SELF withName(String name){
        child.setName(name);
        return self();
    }


    public Child build(){
        return child;
    }

    @Override
    public String toString() {
        return child.toString();
    }

    public SELF self(){
        return (SELF) this;
    }
}