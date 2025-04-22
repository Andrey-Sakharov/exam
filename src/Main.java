import java.util.*;

class SkiCompetition {
    private List<Participant> participants = new ArrayList<>();

    public void registerParticipant(Participant p) {
        participants.add(p);
    }

    public List<Participant> getParticipantsByCategory(String category) {
        List<Participant> result = new ArrayList<>();
        for (Participant p : participants) {
            if (p.getCategory().equals(category)) {
                result.add(p);
            }
        }
        return result;
    }

    public void printAllParticipants() {
        for (Participant p : participants) {
            System.out.println(p);
        }
    }

    public Map<String, Long> getStatistics() {
        return participants.stream()
                .map(Participant::getCategory)
                .collect(java.util.stream.Collectors.groupingBy(
                        category -> category,
                        java.util.stream.Collectors.counting()));
    }

    public static void main(String[] args) {
        SkiCompetition competition = new SkiCompetition();

        competition.registerParticipant(new Amateur(101, "Иван", 23));
        competition.registerParticipant(new Professional(201, "Петр", 30));
        competition.registerParticipant(new Amateur(102, "Мария", 25));
        competition.registerParticipant(new Professional(202, "Елена", 28));

        System.out.println("Все участники:");
        competition.printAllParticipants();

        System.out.println("\nУчастники-любители:");
        List<Participant> amateurs = competition.getParticipantsByCategory("Любитель");
        amateurs.forEach(System.out::println);


        System.out.println("\nСтатистика:");
        Map<String, Long> statistics = competition.getStatistics();
        System.out.println(statistics);
    }
}
