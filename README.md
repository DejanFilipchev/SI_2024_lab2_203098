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

5. MULTIPLE CONDITION

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

ако item.getPrice прими вредност поглема од 300 и item.getDiscount() прими вредност поголема од 0 и item.getBarcode() на првата позиција да прими карактер 0

ако item.getPrice прими вредност поглема од 300 и item.getDiscount() прими вредност поголема од 0 и item.getBarcode() на првата позиција не да прими карактер 0

ако item.getPrice прими вредност поглема од 300 и item.getDiscount() прими вредност помала од 0 и item.getBarcode() на првата позиција да прими карактер 0

ако item.getPrice прими вредност поглема од 300 и item.getDiscount() прими вредност помала од 0 и item.getBarcode() на првата позиција не да прими карактер 0

ако item.getPrice прими вредност помала од 300 и item.getDiscount() прими вредност поголема од 0 и item.getBarcode() на првата позиција да прими карактер 0

ако item.getPrice прими вредност помала од 300 и item.getDiscount() прими вредност поголема од 0 и item.getBarcode() на првата позиција не да прими карактер 0

ако item.getPrice прими вредност помала од 300 и item.getDiscount() прими вредност помала од 0 и item.getBarcode() на првата позиција да прими карактер 0

ако item.getPrice прими вредност помала од 300 и item.getDiscount() прими вредност помала од 0 и item.getBarcode() на првата позиција да не прими карактер 0

6.1 Објаснување на тест примерите зададени погоре
 ![image](https://github.com/DejanFilipchev/SI_2024_lab2_203098/assets/166148306/9ee2af7d-cd0d-461c-928d-ba7ac7310baf)

6.2 Објаснување за Unit тестовите
   
   Test Unit 1
      
   Првиот тест, checkEveryBranch ги тестира можните гранки од кодот за методот checkCart од дадената класа SILab2.
За оваа тестирање користиме метод assertThrows за да провериме дали ќе се фрли исклучок ако се предадат null вредности за allItems параметарот.
Потоа тестот проверува неколку различни сценарија за различни влезни параметри и проверува дали од методот checkCart враќа очекуван резултат.
На пример, се проверува дали се враќа false кога ќе се предаде празна листа со негативни вредности за променливата totalPrice, исто така се проверува дали фрла исклучок кога променливата barcode прима вредност null.

   Test Unit 2

   Вториот тест пример, checkMultipleCondition тестира различни услови и граници за дадениот тест.
Тестираме различни комбинации на влезни параметри за да се опфатат повеќе ситуации за методата checkCart.
На пример, се проверува дали методата враќа посакуван резултат ако вкупната сума за променливата payment е поголема од 10000, односно дали враќа false кога barcode прима карактер "1" на првата позиција.

Со овие тестови ги покриваме различните сценарија за функционалноста на методата checkCart.


