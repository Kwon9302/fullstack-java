package afternoon.nested.nested.ex1;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        if(network.checkNetworkCondition()){
            System.out.println("내일도 비오려나");
        }
    }
}
