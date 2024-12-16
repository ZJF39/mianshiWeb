package cn.edu.hit.mianshiWeb.service;

import cn.edu.hit.mianshiWeb.model.dto.Post.PostQueryRequest;
import cn.edu.hit.mianshiWeb.model.entity.Post;
import cn.edu.hit.mianshiWeb.model.vo.PostVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

public interface PostService extends IService<Post> {

    /**
     * 校验
     * @param post
     * @param add
     */
    void validPost(Post post, boolean add);

    /**
     * 获取帖子封装类
     * @param post
     * @param request
     * @return
     */
    PostVO getPostVO(Post post, HttpServletRequest request);

    /**
     * 获取查询条件
     *
     * @param postQueryRequest
     * @return
     */
    QueryWrapper<Post> getQueryWrapper(PostQueryRequest postQueryRequest);

    /**
     * 分页获取帖子封装
     *
     * @param postPage
     * @param request
     * @return
     */
    Page<PostVO> getPostVOPage(Page<Post> postPage, HttpServletRequest request);
}
