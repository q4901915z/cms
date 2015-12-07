package com.cn.cms.controller.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.cms.entity.Product;
import com.cn.cms.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(HttpServletRequest request, Product model) {
        List<Product> Products = productService.getUserByParams(model.getDescription(), model.getProductName());
        request.setAttribute("Products", Products);
        return "product/products";
    }
}