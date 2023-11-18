https://leetcode.com/problems/list-the-products-ordered-in-a-period/submissions/1101531271/?envType=study-plan-v2&envId=top-sql-50


  
  select product_name,sum(unit) as unit from products 
  left join orders on products.product_id = orders.product_id 
  where (order_date between '2020-02-01' and '2020-02-29') 
  group by product_name having sum(unit)>=100;
