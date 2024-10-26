insert ignore into customers(
    name,
    surname,
    age,
    phone_number
) values
      ('Sergej', 'Ginzburg', 56, 99999999999),
      ('Evegenij', 'Belmondo', 68, 99999999991),
      ('Nickolaj', 'Cage', 55, 19999999999),
      ('Maria', 'Remark', 32, 29999999999);

insert ignore into orders(
    product_name,
    customer_id,
    amount
) values

      ('Mentos', 3, 1),
      ('Twix', 4, 2),
      ('Aqua Minerale', 2, 1),
      ('Mars', 4, 1),
      ('Cola', 1, 2),
      ('Snickers', 2, 1),
      ('Pepsi', 1, 1)
;