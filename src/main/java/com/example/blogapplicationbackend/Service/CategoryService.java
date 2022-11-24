package com.example.blogapplicationbackend.Service;


import com.example.blogapplicationbackend.Entity.Category;
import com.example.blogapplicationbackend.Model.CategoryModel;

import java.util.List;

public interface CategoryService {
//    create
    public CategoryModel createCategory(CategoryModel model);
//    read
    public CategoryModel getCategory(Long id);
//    update
    public CategoryModel updateCategory(Long id, CategoryModel category);
//    delete
    public void deleteCategory(Long id);

    public List<CategoryModel> getAllCategory();
}
