package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                 // sınıfımızın aslında ne olduğu sorusuna cevap verir.
@Table(name="products") // ürünler adındaki tablomuza karşılık geldiğini ifade eder.
public class Product {
	
	@Id                                          // Tüm tanımlarımın karşılık geldiği ürün id'leri olacağı için bunu ayrıca belirttik.
	@GeneratedValue                              // Oluşturulan id'lerin birer arttırılacağını belirttik.
	@Column(name="product_id")                   // Column ile sütun isimleri ile tanımları eşleştirdik.
	private int id;
	
	@Column(name="category_id")                  // Column ile sütun isimleri ile tanımları eşleştirdik.
	private int categoryId;
	
	@Column(name="product_name")                 // Column ile sütun isimleri ile tanımları eşleştirdik.
	private String productName;
	
	@Column(name="unit_price")                   // Column ile sütun isimleri ile tanımları eşleştirdik.
	private double unitPrice;
	
	@Column(name="units_in_stock")               // Column ile sütun isimleri ile tanımları eşleştirdik.
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")            // Column ile sütun isimleri ile tanımları eşleştirdik.
	private String quantityPerUnit;
	
	public Product() {
	
	}

	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatagoryId() {
		return categoryId;
	}

	public void setCatagoryId(int catagoryId) {
		this.categoryId = catagoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
}