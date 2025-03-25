// check if user can give vote -> if yes then give vote.
public class ThrowThrows {
    public static void main(String[] args) {

        try {
            String voteId = canVote(19);

            String voteGiven = vote("ABCD", voteId);
            System.out.println(voteGiven);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static String canVote(int age) throws Exception {

        if (age > 18) {
            return "ABCDEF1234";
        } else {
            throw new Exception("voter can't vote");
        }

    }

    static String vote(String party, String voterId) {
        return "vote given to: " + party + " :with voter id " + voterId;
    }

}

// throw -> generate a new Exception.
// throws -> just a warning (it tells whether a method throws a function or not)

// method throws an error.