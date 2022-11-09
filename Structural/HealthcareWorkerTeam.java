package structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new HashSet<>();

    // @Override
    public void service() {
        // TODO Auto-generated method stub
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        double price = 0;
        for (HealthcareServiceable member : members) {
            price += member.getPrice();
        }
        return price;
    }

    public void addMember(HealthcareServiceable worker) {
        members.add(worker);
    }

    public void removeMember(HealthcareServiceable worker) {
        members.remove(worker);
    }

}