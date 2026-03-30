public class User {
    private final String name;
    private final String age;
    private final String email;
    private final String phone;

    private User(Builder builder){
        this.name=builder.name;
        this.age= builder.age;
        this.email= builder.email;
        this.phone= builder.phone;
    }

    public String getUser(){
        return this.name+" "+this.age+" "+this.email+" "+this.phone;
    }

    public static class Builder{
        private final String name;
        private final String age;

        private String email;
        private String phone;

        public Builder(String name,String age){
            this.name=name;
            this.age=age;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
