class test{
    public static void main(String[] args){
        System.out.println(isConstant("@123"));
    }
    public static boolean isConstant(String s){
        if(s.charAt(0) != '@')
            return false;
        if(s.charAt(1) == '_')
            return true;
        try{
            Integer.parseInt(s.substring(1));
        } catch(NumberFormatException e){
            return false;
        } catch(NullPointerException e){
            return false;
        }
        return true;
    }
}