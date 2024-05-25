Дејан Филипчев 203098

2. Control Flow Graph 

![SI_Lab2_CFG](https://github.com/DejanFilipchev/SI_2024_lab2_203098/assets/166148306/7ef9fd6c-c0a0-45c5-ac53-da5cd3dc13e3)

3. Цикломатската комплексност на овој код е 10, истата е добиена преку формулата P+1 каде P претставува предикантни јазли. Во мојот случај имаме 9 предикантни јазли P=9, што доведува до резултат на цикломатската комплексност 10.

4. EVERY BRANCH

if (allItems == null)

allItems да прими вредност null

allItems да прими вредност различна од null

if (item.getName() == null || item.getName().length() == 0)

ако item.getName() прими вредност null и item.getName().lenght() прими 0

ако item.getName() не прими вредност null и item.getName().lenght() прими 0

ако item.getName() прими вредност null и item.getName().lenght() не прими 0

ако item.getName() не прими вредност null и item.getName().lenght() не прими 0

if (item.getBarcode() != null)

ако item.getBarcode() не прими вредност null

ако item.getBarcode() прими вредност null

if (item.getDiscount() > 0)

ако item.getDiscount() прими вредност поголема од 0

ако item.getDiscount() прими вредност помала од 0

if (sum <= payment)

ако sum прими вредност помала или еднаква од payment

ако sum прими вредност поголема од payment

