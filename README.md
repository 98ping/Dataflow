# Dataflow
An easily manageable database storage that can quickly fetch and post data

# How to use
All you have to do is simply just compile the destined jar that you want to manage your data with. There is no shared module because I have different approaches to how each database should be stored, fetched, and processed.

This is how you initialize:

`MongoDataFlow.of().setClient(your MongoPoolConnection).setDatabase("targetDatabase")`

This will allow you to then use all of the things that dataflow can do such as:

- Setting custom serializers using the `setSerializer(serializer)`
- Getting the collection of a class using `getCollection(Model.class)`
- Saving any item to mongo by just using the model and it's class
- Creating data queries
- All annotation based so no manual registration or abstract classes are required!

