package ltd.matrixstudios.mongo.serialization;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000bH&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lltd/matrixstudios/mongo/serialization/Serialization;", "", "()V", "deserialize", "", "T", "t", "(Ljava/lang/Object;)Ljava/lang/String;", "serialize", "element", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "mongo"})
public abstract class Serialization {
    
    public Serialization() {
        super();
    }
    
    public abstract <T extends java.lang.Object>T serialize(@org.jetbrains.annotations.NotNull()
    java.lang.String element, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.lang.String deserialize(T t);
}