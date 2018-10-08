package Test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
            TripPlannerTest.class,
            DeparturesTest.class,
            RegionalTicketsTest.class,
            TravelInfoOnboardMenuTest.class,
            SearchLostPropertyTest.class
        }
)

public class TestSuite {
}
