package pl.sdacademy.javapoz19programowanie1.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class InMemoryEmployeeRepository implements EmployeeRepository {

    private List<Employee> employees;

    public InMemoryEmployeeRepository() {
        init();
    }

    InMemoryEmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    private void init() {
        this.employees = Arrays.asList(
                new Employee("zzz", 25, 123),
                new Employee("vnbvnbv", 0, 0),
                new Employee("JKDFJLKKDSL", 24, 12345),
                new Employee("test0000000000000001", 23, 123),
                new Employee("Bob29", 23, 123),
                new Employee("sdfdsfds", 24, 54544),
                new Employee("rfdsfdsf", 24, 9566),
                new Employee("sdfgdfg", 24, 0),
                new Employee("grfgfdjhnfgj", 0, 0),
                new Employee("zubair12", 35, 28765),
                new Employee("HarryPotter", 23, 123),
                new Employee("vardha", 87, 120000),
                new Employee("ch", 0, 0),
                new Employee("Nupur", 26, 500000),
                new Employee("ch1", 0, 0),
                new Employee("Bob48", 23, 123),
                new Employee("Bob49", 23, 12345),
                new Employee("Bob378", 99, 12345),
                new Employee("HarryPotter1", 23, 123),
                new Employee("HarryPotter2", 23, 123),
                new Employee("harnisha", 17, 7878),
                new Employee("Bob4144", 80, 100000),
                new Employee("Bob4933", 23, 10000),
                new Employee("testjlm", 23, 123),
                new Employee("sadsd", 32, 3432),
                new Employee("kkkk", 65, 90888),
                new Employee("Bob3789", 99, 12345),
                new Employee("abcdefsgxj", 46, 373783),
                new Employee("TestName36", 29, 26700),
                new Employee("TestName37", 23, 3200),
                new Employee("TestName38", 25, 2673),
                new Employee("TestName39", 34, 4300),
                new Employee("kkckck", 28, 8383),
                new Employee("Visu", 32, 66666),
                new Employee("Souvik", 30, 2000),
                new Employee("eewrfewf", 24, 689),
                new Employee("HarryPotter3", 23, 123),
                new Employee("adsfdhnfgj", 0, 0),
                new Employee("abc123", 99, 12345),
                new Employee("namedummyjETI", 26, 100456),
                new Employee("new test", 26, 50000),
                new Employee("abc1234", 99, 12345),
                new Employee("WNTkC7sj1E", 30, 7637261),
                new Employee("nDrfALW7EV", 30, 0),
                new Employee("John111", 30, 7637261),
                new Employee("sfdhnfgj", 0, 0),
                new Employee("dsfsdfs", 24, 544445),
                new Employee("8123945027", 2147483647, 2147483647),
                new Employee("DhNCokLg3A", 30, 7637261),
                new Employee("Sid9rfHCEF", 30, 0),
                new Employee("Y3CuZIwq50", 30, 7637261),
                new Employee("Bob41445", 80, 100000),
                new Employee("jaanu", 24, 123456),
                new Employee("test12assaa33n", 23, 12312321),
                new Employee("test12as22saan", 23, 12312321),
                new Employee("Bob414454", 80, 100000),
                new Employee("testTrainingCD", 23, 123),
                new Employee("Bob4144545", 80, 100000),
                new Employee("abcd123", 99, 12345),
                new Employee("sdfgdggfdgdf", 24, 566),
                new Employee("gvfgfggfg", 25, 4142),
                new Employee("SampleAPItest", 30, 12345),
                new Employee("HarryPotter4", 23, 123),
                new Employee("emp", 25, 4142),
                new Employee("test91357885", 23, 123),
                new Employee("HarryPotter6", 23, 123),
                new Employee("emp0011", 25, 4142),
                new Employee("Sayali", 29, 20000),
                new Employee("abcd1234", 99, 12345),
                new Employee("hgfjhgj", 25, 4142),
                new Employee("Pravin", 28, 123),
                new Employee("vfdxhgfnj", 0, 0),
                new Employee("{itemId}", 99, 12345),
                new Employee("Pravin1", 28, 123),
                new Employee("Pravin2", 28, 123),
                new Employee("Bipin", 27, 201),
                new Employee("Bipin3", 274, 2014),
                new Employee("abcdef123", 99, 12345),
                new Employee("Reportstest", 25, 1000),
                new Employee("test123545454544", 23, 123),
                new Employee("kala", 24, 0),
                new Employee("vg", 1, 2),
                new Employee("wwe", 1, 1),
                new Employee("DINESH", 23, 123),
                new Employee("guru", 23, 123),
                new Employee("wq", 12, 12),
                new Employee("werere", 1, 1),
                new Employee("rey", 0, 0),
                new Employee("ter", 12, 12),
                new Employee("ff", 12, 12),
                new Employee("123", 12345, 1234),
                new Employee("o9ooooo", 0, 0),
                new Employee("hbnjnjm", 95, 988488),
                new Employee("Onur Deneme1", 26, 260),
                new Employee("workshop_test_create6", 35, 1000),
                new Employee("abcdef1234", 99, 12345),
                new Employee("abcdef12345", 99, 12345),
                new Employee("${dummy_name}", 99, 12345),
                new Employee("s", 99, 12345),
                new Employee("Amit Negi111", 44, 123456),
                new Employee("s2", 99, 12345),
                new Employee("test1", 23, 123),
                new Employee("xyz321", 99, 12345),
                new Employee("SSESEVi", 54, 85984),
                new Employee("fhuewiafhiufiuwef2r23", 23, 123),
                new Employee("testssss", 23, 41234),
                new Employee("Bob3790", 99, 12345),
                new Employee("Bob3791", 99, 12345),
                new Employee("xyz3210", 99, 12345),
                new Employee("xyz32101", 99, 12345),
                new Employee("tasdest", 23, 12),
                new Employee("taest", 23, 1213),
                new Employee("MONICA RINCON", 40, 4000000),
                new Employee("dffddffdfd", 44, 333333),
                new Employee("qrshmdhd", 12, 2147483647),
                new Employee("Dagmar", 32, 425),
                new Employee("SpivakHahn", 680, 609),
                new Employee("sinta pai ", 31, 12340),
                new Employee("Jagan", 29, 20000),
                new Employee("Simran", 30, 30000),
                new Employee("abcsdgh", 12, 2333),
                new Employee("rosamel fierro grueso", 32, 2147483647),
                new Employee("llamadaPrimerEndpoint", 23, 123456789),
                new Employee("Uk Prashanth", 44, 43465),
                new Employee("ZywAaBznFj", 56, 1271),
                new Employee("pOQdgAAPkW", 37, 1535),
                new Employee("SiLgFqYHTP", 3, 8964),
                new Employee("QOwwfOdEdP", 46, 8997),
                new Employee("QOwwfOdEdP1", 46, 8997),
                new Employee("AwjuRJbNwL", 85, 7393),
                new Employee("LTSetSPbpY", 43, 4666),
                new Employee("mIDWFpzjMp", 40, 4717),
                new Employee("YldCHtseyw", 4, 5713),
                new Employee("bEfLmuAInv", 46, 1362),
                new Employee("max", 23, 123),
                new Employee("nrwryOcXaq", 10, 720),
                new Employee("pra1", 0, 0),
                new Employee("pra2", 25, 20000),
                new Employee("SAJKLFJLDJGKL", 23, 1000),
                new Employee("DDLlmObIFP", 78, 149),
                new Employee("SAJKLFJLDJGKL1", 23, 1000),
                new Employee("yoh4566yr65657", 23, 123),
                new Employee("hema", 21, 12000),
                new Employee("Saig", 56, 61022),
                new Employee("test121122", 23, 123),
                new Employee("name5", 23, 123),
                new Employee("h8iok", 23, 123),
                new Employee("Bob3792", 99, 12345),
                new Employee("Saiy", 18, 24509),
                new Employee("test121122332", 23, 123),
                new Employee("modify test", 1126, 1000000),
                new Employee("Vinay Singh", 28, 75),
                new Employee("asfa", 28, 75),
                new Employee("dhgjx", 28, 75),
                new Employee("z2nep", 28, 75),
                new Employee("test132421122332", 23, 123),
                new Employee("test13244321122332", 23, 123),
                new Employee("qem9jm", 28, 75),
                new Employee("38rufm", 28, 75),
                new Employee("b1rr29", 28, 75),
                new Employee("16738w", 28, 75),
                new Employee("e0vss", 28, 75),
                new Employee("sinta pais ", 31, 12340),
                new Employee("test88888", 23, 123),
                new Employee("tesdt", 23, 123),
                new Employee("nagarjuna1", 31, 855000),
                new Employee("z4icf", 28, 75),
                new Employee("3gxrhh", 28, 75),
                new Employee("Bob37789", 23, 10000),
                new Employee("dankjesus", 69, 420),
                new Employee("SSESEVj", 12, 63578),
                new Employee("SSESEVO", 94, 50167),
                new Employee("sfgsfd", 23, 123),
                new Employee("test23", 23, 123),
                new Employee("ra", 23, 123),
                new Employee("its me", 23, 123),
                new Employee("guy", 23, 123),
                new Employee("da", 2, 1),
                new Employee("yuh", 23, 123),
                new Employee("ffyh", 23, 123),
                new Employee("Jhon Doe", 25, 23456),
                new Employee("AAA BBB", 25, 500),
                new Employee("morpheus", 0, 0),
                new Employee("Jhon Wick", 30, 999999999),
                new Employee("baz", 10, 20),
                new Employee("Jhon Snow", 30, 999999999),
                new Employee("tyhj", 23, 123),
                new Employee("gh", 23, 123),
                new Employee("hj", 23, 123),
                new Employee("MARCELO LARA", 45, 2000000),
                new Employee("MANUEL JARA", 22, 1200000),
                new Employee("VICTOR RAMA", 33, 1000000)
        );
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public List<Employee> sortByAge() {
        return sortBy(employee -> employee.getAge());
    }

    @Override
    public List<Employee> sortBySalary() {
        return sortBy(employee -> employee.getSalary());
    }

    private List<Employee> sortBy(ToIntFunction<Employee> selector) {
        return employees.stream()
                .sorted(Comparator.comparingInt(selector))
                .collect(Collectors.toList());
    }


}
