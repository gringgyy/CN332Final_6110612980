public class Login {
    private String username;
    private String password;
    public Login(String unameVal, String pwordVal) {
        Register reg = new Register();
        username = unameVal;
        password = pwordVal;
        checkValid(username,password);
    }

    public boolean checkValid(String uname, String pword){
        for (int i = 1; i<=reg.number; i++){
            if(uname.equals(reg.unameArr[i]) && pword.equals(reg.pwordArr[i])){
                return true;
            }
            else {
                return false;
            }
        }
    }
    

}