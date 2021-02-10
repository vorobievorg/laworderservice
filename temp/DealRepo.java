package org.vorobiev.lawOrder.db;


        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface DealRepo  extends JpaRepository<Deal,Integer> {


}