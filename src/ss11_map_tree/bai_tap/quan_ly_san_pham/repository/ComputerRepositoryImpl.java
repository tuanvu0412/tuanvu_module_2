package ss11_map_tree.bai_tap.quan_ly_san_pham.repository;

import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepositoryIplm implements IComputerIplm {
    static ArrayList<Computer> computers = new ArrayList<>();

    static {
        computers.add(new Computer("04", "DELLSPX1", "30-04-2015", "dell"));
        computers.add(new Computer("02", "DELLSPX2", "30-04-2015", "dell"));
        computers.add(new Computer("03", "DELLSPX3", "30-04-2015", "dell"));
    }

    @Override
    public List<Computer> getComputerlist() {
        return computers;
    }

    @Override
    public void addComputerList(Computer computer) {
        computers.add(computer);
    }


    @Override
    public boolean editComputer(String code, Computer computer) {
        for (int i = 0; i < computers.size(); i++) {
            if (code.equals(computers.get(i).getCode())) {
                computers.set(i, computer);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteComputer(String code) {
        for (Computer computer : computers) {
            if (computer.getCode().equals(code)) {
                computers.remove(computer);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findComputer(String name) {
        for (Computer computer : computers) {
            if (name.equals(computer.getName())) {
                System.out.println(computer);
                return true;
            }
        }
        return false;
    }
}
