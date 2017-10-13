package com.test.mapper;

import com.test.entity.BlzImgEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/8/31.
 */
public interface BlzImgMapper {

    @Select("SELECT * FROM blz_img")
    @Results({
            @Result(property = "imgName", column = "img_name"),
            @Result(property = "imgUrl", column = "img_url"),
            @Result(property = "imgSize", column = "img_size"),
            @Result(property = "imgGroup", column = "img_group"),
            @Result(property = "imgSource", column = "img_source"),
            @Result(property = "imgNameCH", column = "img_name_ch"),
            @Result(property = "imgDescripe", column = "img_descripe"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "createTime", column = "create_time")
    })
    List<BlzImgEntity> getAll();

    @Select("SELECT * FROM blz_img WHERE id=#{id}")
    @Results({
            @Result(property = "imgName", column = "img_name"),
            @Result(property = "imgUrl", column = "img_url"),
            @Result(property = "imgSize", column = "img_size"),
            @Result(property = "imgGroup", column = "img_group"),
            @Result(property = "imgSource", column = "img_source"),
            @Result(property = "imgNameCH", column = "img_name_ch"),
            @Result(property = "imgDescripe", column = "img_descripe"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "createTime", column = "create_time")
    })
    BlzImgEntity getOne(String id);


    @Insert("INSERT INTO blz_img(id, img_name, img_url, img_size, img_group, img_source, img_name_ch, img_descripe, create_time" +
            "VALUES(#{id},#{imgName}, #{imgUrl}, #{imgSize}, #{imgGroup}, #{imgSource}, #{imgNameCH}, #{imgDescripe}, #{createTime}) ) ")
    void insertOne(BlzImgEntity blzImgEntity);

    @Update("UPDATE blz_img SET img_name=#{imgName}, img_url=#{imgUrl}, img_size=#{imgSize}, img_group=#{imgGroup}, img_source=#{imgSource}," +
            "img_name_ch=#{imgNameCH}, img_descripe=#{imgDescripe}, update_time=#{updateTime}")
    void updateOne(BlzImgEntity blzImgEntity);

    @Delete("DELETE FROM blz_img WHERE id=#{id}")
    void deleteOne(String id);

}
