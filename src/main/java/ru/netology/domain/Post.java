package ru.netology.domain;

public class Post {
    private int id; //
    private int ownerId; //
    private int createdBy; //

    private Header header; //

    private TextWithImage text; //

    private Copyright copyright; //

    private LikesInfo like; //
    private CommentsInfo comment; //
    private SharesInfo share; //
    private ViewsInfo view; //
    private String postType; //
    private PostSource postSource;
    private Geo geo; //
    private int signerId; //
    private boolean canPin; //
    private boolean canDelete; //
    private boolean canEdit; //
    private boolean isPinned; //
    private boolean markedAsAds; //
    private boolean isFavorite; //
    private Donut donut; //
    private int postponedId; //
}
