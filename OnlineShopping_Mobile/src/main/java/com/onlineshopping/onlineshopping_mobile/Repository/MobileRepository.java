package com.onlineshopping.onlineshopping_mobile.Repository;

import com.onlineshopping.onlineshopping_mobile.Model.Model;

import java.util.List;

public interface MobileRepository extends JpaRepository<Model,Long> {


    List<Model> findAll();
}
