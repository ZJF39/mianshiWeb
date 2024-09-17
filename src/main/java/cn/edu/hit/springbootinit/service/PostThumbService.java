package cn.edu.hit.springbootinit.service;

import cn.edu.hit.springbootinit.model.entity.PostThumb;
import cn.edu.hit.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface PostThumbService extends IService<PostThumb> {
    /**
     * 点赞
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    int doPostThumbInner(long userId, long postId);
}
