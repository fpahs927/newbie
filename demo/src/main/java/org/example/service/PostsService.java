package org.example.service;
import lombok.RequiredArgsConstructor;
import org.example.domain.posts.Posts;
import org.example.domain.posts.PostsRepository;
import org.example.web.dto.PostsResponseDto;
import org.example.web.dto.PostsSaveRequestsDto;
import org.example.web.dto.PostsUpdateRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;
    @Transactional
    public Long save(PostsSaveRequestsDto requestsDto){
        //return postsRepository.save(requestDto.toEntity()).getId();
        return postsRepository.save(requestsDto.toEntity()).getId();
    }
    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("해당게시글이 없습니다 id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }
    public PostsResponseDto findById(Long id){
        Posts entity= postsRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("해당게시글이 없습니다 id="+id));
        return new PostsResponseDto(entity);
    }


}
