import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Product.Product;


//    public void updateProdProduct.Product;

public class Seller {



 public void updateProductList(Store store, Product updatedProduct) {
        store.updateProduct(updatedProduct);
        updateCSVFile(store.getAllProducts());
    }

    private void updateCSVFile(List<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("product_list.csv"))) {
            writer.write("productId,productName,price,quantity\n");
            for (Product product : products) {
                writer.write(product.getProductId() + "," +
                        product.getProductName() + "," +
                        product.getPrice() + "," +
                        product.getQuantity() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



