public class Main {
    public static void main(String[] args) {
        SaveRecord saveRecord = new SaveRecord();
        ReadRecord readRecord = new ReadRecord();
        DeleteRecord deleteRecord = new DeleteRecord();
        UpdateRecord updateRecord = new UpdateRecord();

        Employee employee = new Employee(0, "Bob", "Bobalski",
                "programmer", "Lodz", 30, 10000);

//        saveRecord.saveEmployee(employee);
//        readRecord.getEmployee(7);
//        System.out.println("wybrany id "+ readRecord.getEmployee(7));
//        deleteRecord.deleteEmployee(1);
        updateRecord.updateEmployee(3,"Marek");
    }
}
