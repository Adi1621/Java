public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Aditya ");
        str.append("Kanswal");
        str.append(1411);
        str.setCharAt(0, 'a' );
        str.insert(2,'d');
        str.deleteCharAt(1);
        str.delete(7,14);
    

        System.out.println(str);
    }
    
}
