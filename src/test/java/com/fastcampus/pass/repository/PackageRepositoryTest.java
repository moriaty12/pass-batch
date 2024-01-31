package com.fastcampus.pass.repository;

import com.fastcampus.pass.repository.booking.BookingEntity;
import com.fastcampus.pass.repository.booking.BookingRepository;
import com.fastcampus.pass.repository.packaze.PackageEntity;
import com.fastcampus.pass.repository.packaze.PackageRepository;
import com.fastcampus.pass.repository.pass.PassEntity;
import com.fastcampus.pass.repository.pass.PassRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class) // https://n1tjrgns.tistory.com/224 참조
@Slf4j
@SpringBootTest
@ActiveProfiles("test")
public class PackageRepositoryTest {
    /*@Autowired
    private PackageRepository packageRepository;*/

    /*@Test
    public void test_save(){
        //given
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setPackageName("바디 챌린지 PT 12주");
        packageEntity.setPeriod(84);

        //when
        packageRepository.save(packageEntity);

        //then
        assertNotNull(packageEntity.getPackageSeq());
    }

    @Test
    public void test_findByCreatedAtAfter(){
        // given
        LocalDateTime dateTime = LocalDateTime.now().minusMinutes(1);

        PackageEntity packageEntity0 = new PackageEntity();
        packageEntity0.setPackageName("학생 전용 3개월");
        packageEntity0.setPeriod(90);
        packageRepository.save(packageEntity0);

        PackageEntity packageEntity1 = new PackageEntity();
        packageEntity1.setPackageName("학생 전용 6개월");
        packageEntity1.setPeriod(180);
        packageRepository.save(packageEntity1);

        // when
        final List<PackageEntity> packageEntities = packageRepository.findByCreatedAtAfter(dateTime, PageRequest.of(0,1,Sort.by("packageSeq").descending()));
        // then
        assertEquals(1,packageEntities.size());
        *//*assertEquals(packageEntity1.getPackageSeq(),packageEntities.get(1));*//*
    }

    @Test
    public void test_updateCountAndPeriod(){
        // given
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setPackageName("학생 전용 6개월");
        packageEntity.setPeriod(180);
        packageRepository.save(packageEntity);

        // when
        int updateCount = packageRepository.updateCountAndPeriod(packageEntity.getPackageSeq(),30,120);
        final PackageEntity updatePackageEntity = packageRepository.findById(packageEntity.getPackageSeq()).get();

        // then
        assertEquals(1,updateCount);
        assertEquals(30, Optional.ofNullable(updatePackageEntity.getCount()));
        assertEquals(120, Optional.ofNullable(updatePackageEntity.getPeriod()));
    }

    @Test
    public void test_delet(){
        //given
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setPackageName("제거할 이용권");
        packageEntity.setCount(1);
        PackageEntity newPacakgeEntity = packageRepository.save(packageEntity);
        //when
        packageRepository.deleteById(newPacakgeEntity.getPackageSeq());

        //then
        *//*assertEquals(packageRepository.findById(newPacakgeEntity.getPackageSeq()).isEmpty());*//*
    }*/

}
