public class main{
    public static void main(String[] args){
        Heap pile=new Heap();
        pile.add(2);
        pile.add(1);
        pile.add(10);
        pile.add(7);
        pile.add(6);
        pile.add(8);
        pile.removeMax();
        for(int i=0;i<8;i++){
            System.out.println(pile.getInt(i));
        }
    }
}