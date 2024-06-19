package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 17,92);
        MemberConstruct member2 = new MemberConstruct("user1", 18,64);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct member : members) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }
}
