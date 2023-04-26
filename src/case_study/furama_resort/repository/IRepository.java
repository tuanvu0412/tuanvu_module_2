package case_study.furama_resort.repository;

import java.util.List;

public interface IRepository<E> {
    List<E> getList();

    void addNew(Object object);
}
