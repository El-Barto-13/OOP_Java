Для того чтобы переработать приложение с учётом принципа SPR (Single Responsibility Principle - принцип единственной ответственности), мы можем разделить задачи по вводу данных с консоли и сохранению заказа в формате JSON на разные классы.

В этом переработанном коде класс Order отвечает только за представление объекта заказа, класс JsonSerializer отвечает за сериализацию заказа в JSON, класс OrderFileWriter отвечает за сохранение заказа в файл в формате JSON, а класс InputReader отвечает за считывание пользовательского ввода с консоли и создание объекта Order.

Разделение ответственностей позволяет каждому классу выполнять только одну задачу, что делает код более удобным для поддержки и соответствующим принципу SPR.