public class Order {
    int code;
    String client;
    int bricks;

    public Order(int code, String client, int bricks) {
        this.code = code;
        this.client = client;
        this.bricks = bricks;
    }

    public String getClient() {
        return client;
    }

    public int getBricks() {
        return bricks;
    }

    public int getCode() {
        return code;
    }

    public String toString() {
        return "Code: " + this.code + ", Client: " + this.client + ", Amount of bricks: " + this.bricks;
    }
}
