'''
An online store gives ₹100 discount on orders above ₹1000.

prices = [750, 1200, 3000, 450, 1800]


Task:
Create a new list with final prices after discount.
'''

final_prices = []

for price in prices:
    if price > 1000:
        final_prices.append(price - 100)
    else:
        final_prices.append(price)

print(final_prices)
