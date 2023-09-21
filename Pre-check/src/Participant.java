import java.util.ArrayList;
import java.util.Arrays;

interface Participant_interface{
    public void set_name(String newName);
    public String get_name();
    public void set_surname(String newSurname);
    public String get_surname();
    public void set_age(int newAge);
    public int get_age();
    public void set_sportType(String newSportType);
    public String get_sportType();
    public void addTolistAwards(String newAwards);
    public void removeFromlistAwards(String removeAwards);
    public void clearlistAwards();
    public ArrayList<String> get_ListAwards();

}

public class Participant implements Participant_interface{

    private String name;
    private String surname;
    private int age;
    private String sportType;
    private ArrayList<String> listAwards = new ArrayList<String>();

    Participant(String name, String surname, int age, String sportType, String[] listAwards){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sportType = sportType;
        this.listAwards.addAll(Arrays.asList(listAwards));
    }


    public void set_name(String newName){
        name = newName;
    }

    public String get_name(){
        return name;
    }

    public void set_surname(String newSurname){
        surname = newSurname;
    }

    public String get_surname(){
        return surname;
    }

    public void set_age(int newAge){
        age = newAge;
    }

    public int get_age(){
        return age;
    }

    public void set_sportType(String newSportType){
        sportType = newSportType;
    }

    public String get_sportType(){
        return sportType;
    }

    public void addTolistAwards(String newAwards){
        listAwards.add(newAwards);
    }
    public void removeFromlistAwards(String removeAwards){
        listAwards.remove(removeAwards);
    }
    public void clearlistAwards(){
        listAwards.clear();
    }
    public ArrayList<String> get_ListAwards(){
        return listAwards;
    }

    public String toString(){
        String msg = "full name: " + name + " " + surname + "\n" + "Age: " + age + "\n" + "Sport type: "+  sportType + "\n" + "Awards: " + listAwards + "\n";
        return msg;
    }








    public static void main(String[] args) {

        // initialize 4 participant
        Participant participant1 = new Participant("Sheikh", "Muhammad",22, "Climbing", new String[]{"national", "international"});
        Participant participant2 = new Participant("Adib", "Bin",23, "Climbing", new String[]{"national"});
        Participant participant3 = new Participant("Abu", "Bakar",24, "Cycling", new String[]{"national", "international"});

        // collect all the participant in a list
        ArrayList<Participant> listParticipant = new ArrayList<Participant>();
        listParticipant.add(participant1);
        listParticipant.add(participant2);
        listParticipant.add(participant3);

        //System.out.println(listParticipant);

        // test
        ArrayList<String> aspected_list = new ArrayList<String>();
        ArrayList<String> output_list = new ArrayList<String>();
        int aspected_numOfInternationalAwardStudennt = 2;
        int output_numOfInternationalAwardStudennt = 0;
        int aspected_numOfNationalAwardStudennt = 3;
        int output_numOfNationalAwardStudennt = 0;


        // select participant with sport type = Climbing
        aspected_list.add("Muhammad Sheikh");
        aspected_list.add("Bin Adib");
        System.out.println("\nParticipant with sportType \"Climbing\"");
        for ( Participant participant : listParticipant){
            if(participant.sportType.equals("Climbing")){
                String fullName = participant.surname+ " " + participant.name;
                System.out.println(fullName);
                output_list.add(fullName);

            }
        }

        assert aspected_list.equals(output_list);
        if (aspected_list.equals(output_list)){
            System.out.println("\nPass");
        }

        // select participant with sport type = Climbing
        System.out.println("\nParticipant with international award");
        for ( Participant participant : listParticipant){
            for (String award: participant.listAwards){
                if (award.equals("international")){
                    String fullName = participant.surname+ " " + participant.name;
                    System.out.println(fullName);
                    output_numOfInternationalAwardStudennt +=1 ;
                }
            }
        }

        assert aspected_numOfInternationalAwardStudennt == output_numOfInternationalAwardStudennt;
        if (aspected_numOfInternationalAwardStudennt == output_numOfInternationalAwardStudennt){
            System.out.println("\nPass");
        }

        // select participant with sport type = Climbing
        System.out.println("\nParticipant with national award");
        for ( Participant participant : listParticipant){
            for (String award: participant.listAwards){
                if (award.equals("national")){
                    String fullName = participant.surname+ " " + participant.name;
                    System.out.println(fullName);
                    output_numOfNationalAwardStudennt +=1 ;
                }
            }
        }

        assert aspected_numOfNationalAwardStudennt == output_numOfNationalAwardStudennt;
        if (aspected_numOfNationalAwardStudennt == output_numOfNationalAwardStudennt){
            System.out.println("\nPass");
        }



    }
}