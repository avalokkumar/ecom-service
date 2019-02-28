# ecom-service
Microservices for ecommerce platform

Ecom Manager

ecom-shop-service - service to provide omnichannel experience to its customers

Can have multiple Shops:
-	Shop 1
-	Shop 2
-	Shop 3
-	Shop 4
-	Shop 5
-	Shop 6

ecom-warehouse-service - service to manage warehouse and product stock
Warehouse:
	Attr:
		-	name
		-	id
		-	List<Category> productCategories
				-	Category : 
						-	categoryId
						-	categoryName
						-	List<Category> subCategories
						-	List<Quantity>
								- Quantity
									-	count
									-	quantityStatus (Available, Expired, Arriving)
						-	

-	Warehouse 1
-	Warehouse 2
-	Warehouse 3

ecom-product-catalog-service
Product Catalog:

 -	tags
 -	description
 -	price
 -	category
 -	delivery terms
 -	several photos of each product


ecom-fulfillment-service - Service for receiving, processing, packaging and shipping orders made in your online store.


ecom-inventory-service
The retailer’s current quantity of products on hand, waiting to be sold.


ecom-shipment-service - Service responsible for product shipment

	Attr :
		- shipment Id - UUID
		- order id - UUID
		- isPartialShipment - boolean (A type of shipment where The online store merchant ships only some of the products in a single order)


ecom-analytic-service - Service responsible for generating reports and charts

ecom-payment-service - service responsible for payments and refunds

ecom-customer-verification-service - service responsible for customer verification through phone number or customer id

ecom-customer-registration-service - service responsible for customer registration

ecom-delivery-service






