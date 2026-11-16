package com.iab.omid.library.unity3d.adsession.media;

/* JADX INFO: loaded from: classes7.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }

    InteractionType(String str) {
        this.interactionType = str;
    }
}
