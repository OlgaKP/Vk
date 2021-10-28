package manager;

import domain.*;

public class Post {
    private int id;
    private int ownerId;

    private Header header;
    private String descriptionPost;
    private String imageUrl;

    private LikesInfo like;
    private CommentsInfo comment;
    private SharesInfo share;
    private ViewsInfo view;
}
