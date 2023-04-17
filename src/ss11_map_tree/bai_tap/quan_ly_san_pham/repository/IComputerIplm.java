package ss11_map_tree.bai_tap.quan_ly_san_pham.repository;

import ss11_map_tree.bai_tap.quan_ly_san_pham.model.Computer;

import java.util.List;

public interface IComputerIplm {
    List<Computer> getComputerlist();

    void addComputerList(Computer computer);

    boolean editComputer(String code, Computer computer);

    boolean deleteComputer(String code);

    boolean findComputer(String name);
}
