package com.ldx.eduline.college.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ldx.eduline.college.entity.EduTeacher;
import com.ldx.eduline.college.service.EduTeacherService;
import com.ldx.eduline.common.bean.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author ldx
 * @since 2020-12-20
 */
@RestController
@Api("讲师管理")
@RequestMapping("/college/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("{current}/{size}")
    @ApiOperation("讲师列表")
    public R list(@PathParam("size") Long size, @PathParam("current") Long current  ){
        Page<EduTeacher> page = new Page<>(current,size);
        QueryWrapper<EduTeacher> queryWrapper = new QueryWrapper<>();
        IPage<EduTeacher> pageList = eduTeacherService.page(page, queryWrapper);
        return R.success().addData("teacherList",pageList);
    }

    @DeleteMapping("{id}")
    @ApiOperation("逻辑删除讲师")
    public R delTeacher(@PathVariable @ApiParam(name = "id",value = "讲师id",required = true) String id){
        boolean b = eduTeacherService.removeById(id);
        return R.success();
    }

}

