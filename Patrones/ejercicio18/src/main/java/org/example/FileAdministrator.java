package org.example;

public class FileAdministrator {
    private FileOO2 file;
    private FileComponent component;

    public FileAdministrator(FileOO2 file) {
        this.file = file;
        component = file;
    }

    public void printFileInOrder() {
        System.out.println(component.prettyPrint());
    }

    public void addSize() {
        this.component = new SizeDecorator(this.component);
    }

    public void addExtension() {
        this.component = new ExtensionDecorator(this.component);
    }

    public void addCreationDate() {
        this.component = new CreationDateDecorator(this.component);
    }

    public void addUpdateDate() {
        this.component = new UpdateDateDecorator(this.component);
    }

    public void addPermission() {
        this.component = new PermissionDecorator(this.component);
    }

    public void reset() {
        this.component = this.file;
    }
}
