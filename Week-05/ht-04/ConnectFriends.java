public class ConnectFriends {

    public String name;
    public int capacity;
    public ConnectFriends[] request;
    public int count;

    public ConnectFriends(String n) {
        this(n, 2);
    }

    public ConnectFriends(String n, int c) {
        name = n;
        capacity = c;
        request = new ConnectFriends[c];
        System.out.println("Welcome to ConnectFriends, " + n);
    }

    public void sendFriendRequest(ConnectFriends frnd1) {
        if (count >= capacity) {
            System.out.println(name + " has reached the friend request limit!");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (request[i] == frnd1) {
                System.out.println("Request already sent to " + frnd1.name);
                return;
            }
        }
        request[count++] = frnd1;
        System.out.println(name + " sent a friend request to " + frnd1.name);
    }

    public void sendFriendRequest(ConnectFriends frnd1, ConnectFriends frnd2) {
        int temp = count;
        sendFriendRequest(frnd1);
        if (temp != count) {
            sendFriendRequest(frnd2);
        }
    }

    public void showDetails() {
        System.out.println("User Name: " + name);
        System.out.println("Maximum number of Sent Friend Request: " + capacity);
        System.out.println("Total Friends Request: " + count);
        System.out.print("Sent Friends Request: ");
        for (int i = 0; i < count; i++) {
            System.out.print(request[i].name + " ");
        }
        System.out.println();
    }

    public void removeRequest(String n) {

        for (int i = 0; i < count; i++) {
            if (request[i].name.equals(n)) {
                for (int j = i; j < count - 1; j++) {
                    request[j] = request[j + 1];
                }
                count--;
                System.out.println("Request to add " + n + " is removed for " + name);
                return;
            }
        }

        System.out.println(n + " is not in " + name + "'s sent request list.");
    }
}
