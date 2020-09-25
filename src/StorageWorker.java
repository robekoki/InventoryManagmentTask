public class StorageWorker implements Observer{
    @Override
    public void onNewItem(Item item) {
        System.out.println(String.format("%d, new %s arrived to storage", item.getCountInStorage(), item.getName()));
    }
}
