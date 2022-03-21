package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("3b1266b9-3cc6-4f1d-b901-60f86249b5e8"), "DillionHarper", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("ea565269-7334-4c2d-8da1-a1066db80981"), "LazloCalifornia", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
