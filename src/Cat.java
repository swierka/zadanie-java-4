public class Cat{

        public void Kot() {
            class Local {
            };
            String name = Local.class.getEnclosingMethod().getName();
            System.out.println(name);
        }
}
