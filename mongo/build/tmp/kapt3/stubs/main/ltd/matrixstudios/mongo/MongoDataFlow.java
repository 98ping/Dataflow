package ltd.matrixstudios.mongo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\"\u0004\b\u0000\u0010\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0000J/\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u0002H\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020#J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006-"}, d2 = {"Lltd/matrixstudios/mongo/MongoDataFlow;", "", "()V", "mainSerializer", "Lltd/matrixstudios/mongo/serialization/Serialization;", "getMainSerializer", "()Lltd/matrixstudios/mongo/serialization/Serialization;", "setMainSerializer", "(Lltd/matrixstudios/mongo/serialization/Serialization;)V", "mongoClient", "Lcom/mongodb/MongoClient;", "getMongoClient", "()Lcom/mongodb/MongoClient;", "setMongoClient", "(Lcom/mongodb/MongoClient;)V", "mongoDatabase", "Lcom/mongodb/client/MongoDatabase;", "getMongoDatabase", "()Lcom/mongodb/client/MongoDatabase;", "setMongoDatabase", "(Lcom/mongodb/client/MongoDatabase;)V", "createQuery", "Lltd/matrixstudios/mongo/query/Query;", "T", "clazz", "Ljava/lang/Class;", "getCollection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "owningClass", "getLocalSerializer", "of", "save", "", "id", "", "t", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)V", "setClient", "uri", "setDatabase", "databaseName", "setSerializer", "serialization", "Companion", "mongo"})
public final class MongoDataFlow {
    public com.mongodb.MongoClient mongoClient;
    public com.mongodb.client.MongoDatabase mongoDatabase;
    @org.jetbrains.annotations.NotNull()
    private ltd.matrixstudios.mongo.serialization.Serialization mainSerializer;
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.mongo.MongoDataFlow.Companion Companion = null;
    public static ltd.matrixstudios.mongo.MongoDataFlow instance;
    
    public MongoDataFlow() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.MongoClient getMongoClient() {
        return null;
    }
    
    public final void setMongoClient(@org.jetbrains.annotations.NotNull()
    com.mongodb.MongoClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoDatabase getMongoDatabase() {
        return null;
    }
    
    public final void setMongoDatabase(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.serialization.Serialization getMainSerializer() {
        return null;
    }
    
    public final void setMainSerializer(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.mongo.serialization.Serialization p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.MongoDataFlow of() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.MongoDataFlow setClient(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.MongoDataFlow setDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String databaseName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.MongoDataFlow setSerializer(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.mongo.serialization.Serialization serialization) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.mongodb.client.MongoCollection<org.bson.Document> getCollection(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> owningClass) {
        return null;
    }
    
    public final <T extends java.lang.Object>void save(@org.jetbrains.annotations.NotNull()
    java.lang.String id, T t, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> owningClass) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>ltd.matrixstudios.mongo.query.Query<T> createQuery(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.mongo.serialization.Serialization getLocalSerializer() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/mongo/MongoDataFlow$Companion;", "", "()V", "instance", "Lltd/matrixstudios/mongo/MongoDataFlow;", "getInstance", "()Lltd/matrixstudios/mongo/MongoDataFlow;", "setInstance", "(Lltd/matrixstudios/mongo/MongoDataFlow;)V", "mongo"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.mongo.MongoDataFlow getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.mongo.MongoDataFlow p0) {
        }
    }
}