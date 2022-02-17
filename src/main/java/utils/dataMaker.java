package utils;

import java.util.ArrayList;
import java.util.List;

public class dataMaker {
    //60
    Double[] dataList60 = {0.06556448693815964, 0.48010877365777604, 1.292149650972894, 1.232534015634155, 1.105097147208758, 1.7638310993459494, 1.8094460414697913, 2.262134034821895, 3.828558669865555, 3.9522456745611385, 3.6474360029158945, 2.9955173965313513, 3.109392742097828, 2.9851540601930564, 3.3318218141270086, 2.7172061447293805, 2.7815893877959748, 2.144863279349391, 2.520762014699636, 1.6195145861187574, 2.2296596376079063, 3.140466555776065, 2.711045897805552, 2.707713008847286, 2.6089845217357515, 1.4058847009427, 1.4198581214671888, 1.460493854271289, 1.6065391552103285, 1.5003229693917346, 1.692336377013243, 1.6091009616738823, 0.5545723205903348, 0.6439709042427187, 1.7620145113829238, 1.6473217505707638, 1.7505249101535867, 1.6024394889119555, 1.3244156894583319, 1.3040209271175822, 1.9079412735857475, 2.2061391766667335, 2.009238001223155, 1.6098335176291103, 1.4585783307094462, 0.3364794439308636, 0.11616708589186236, -0.17069118625107604, -0.09301239849271171, 1.467839812027258, 1.2332350566514605, 2.534360204481153, 3.0651883547049277, 3.0729952518639423, 2.490244019110559, 2.49040559579102, 2.088725716324906, 1.7420265832476192, 1.625850216063283, 2.6189769774348335};
    Double[] dataList1200 = {0.5595003112549602, 1.3639806820541858, 2.137837351896966, 2.0015186507730878, 1.933949647949968, 2.581026983948352, 3.5182157226051576, 3.35144612375512, 3.3657323681755273, 3.6017066529740878, 3.710961735271034, 3.294298094019426, 3.097204936316644, 3.6543808986181316, 3.275184377227908, 3.1574872494737534, 5.27658381894338, 4.82631699354356, 4.524575837593102, 5.178142902493283, 4.926978132445306, 4.9949960337202555, 6.197236543494643, 6.404079337074205, 6.725262721468832, 7.070602486454207, 6.756389328858323, 6.488053274252615, 7.227902741445757, 7.400295453502472, 6.703627922963651, 6.404972743296854, 6.373203282943466, 7.246913194520863, 7.163817686641614, 7.054584909641746, 5.789975084164128, 5.956030094039954, 6.298836689775729, 6.7922616361747865, 6.704890003956263, 6.751622936184834, 6.804728153848232, 6.653756593472514, 6.631290806932657, 6.77121445726776, 6.592466784350061, 6.707185112662367, 6.1354041390285605, 6.823721743070754, 6.824189667310976, 6.841298767096658, 6.970181427003006, 7.069743926875009, 6.908508258367209, 8.849227968369679, 8.633240472182585, 7.103562975680514, 7.362437585616736, 8.180415740854034, 8.4423098434125, 8.190366675974671, 7.372195950505263, 6.055633603226417, 6.507251190069303, 6.31917671296189, 6.355396096292633, 6.3220951857460514, 5.402118522075813, 5.260867085120779, 3.599282682845409, 4.999573728309486, 4.88364997651117, 2.8859170270346812, 1.6407734572681256, 1.6241541712119116, 1.0728598749106886, -0.10280488862133819, -0.7091584443118145, -1.3889243826848598, -0.7858247836255103, 0.19871147644549048, 0.6760244197840695, -0.17629332022616995, 0.36440373140852855, 0.2170715232438034, -0.9572249502401682, -2.425960340135388, -2.6090602004893553, -1.636188707011283, -2.113025408445556, -3.2749306407237277, -3.6234391055206547, -4.324096044612165, -3.740281896120326, -4.783393473401983, -4.646474504102945, -4.767338130232622, -4.76517075702694, -4.136332542508021, -4.079189696241965, -3.1300303906483764, -1.3460118238461471, 0.19099248595636187, 0.301687374908501, 0.2925763839160748, -0.03903332381005664, 0.22190843283764378, -0.5450827696006653, -0.5074073741034962, 1.1822301101413561, 1.318773301222183, 1.3438181724821747, 0.8276477305724955, 0.9528708781057009, 0.058092952959350797, 0.31057543502246315, 1.3996630466807742, 2.6416866482970054, 2.674724607906775, 2.656516424613111, 2.210942621648084, 2.2652506838518334, 2.2064253250046733, 2.245250063403483, 2.2200848383129244, 3.0602679848304346, 3.9575923752755284, 4.149073614474311, 4.9104599150524875, 4.376041240467108, 4.672866380334532, 5.037992655720461, 5.039169442422406, 5.680654688733845, 5.606905377828129, 5.547994962036814, 5.594026729829787, 5.392270937933437, 4.772691315845711, 4.580184521455792, 3.5175953247363587, 4.204542640146348, 4.214771901633052, 4.321237570940339, 3.5286497262747214, 3.8610778234000565, 2.763145575454401, 3.2949675753212, 3.122947853220668, 2.0213319150104976, 2.3135183554837493, 4.486621744174748, 4.433383613460768, 4.373100922480235, 3.5962228284971394, 3.4940688305403076, 3.4602356095372255, 3.8307666306143355, 3.8497112854903004, 3.9270285281114177, 4.689514372565773, 4.897587536048787, 4.517164953358739, 4.4139065649158695, 4.722812471648324, 4.851295675605117, 4.968888918197173, 4.993337568987863, 5.581271188942546, 4.019003515509143, 5.023086529427969, 4.619883771610541, 5.481974827530479, 5.475793598138684, 5.207524619365943, 4.9488522368478005, 5.870387020843065, 5.945421847887126, 6.5601563555351285, 5.754508240634193, 5.184466040059739, 7.2968958947309845, 6.969083869288094, 5.736480447791368, 6.89037553471261, 6.423703000749263, 6.363275404037096, 6.60448891569863, 4.102308343852307, 5.158700934418169, 5.864812366100424, 6.289240348377773, 5.507051701048485, 5.34805084782328, 5.617413212100728, 5.910613255990373, 5.507670423849378, 5.665166644411874, 6.388915865770642, 6.1846107897013844, 7.0381594649853385, 8.270893606095223, 8.456148874574161, 7.533998760981938, 7.9370659688792875, 7.998169375919367, 7.8130273786353, 7.740201597674747, 6.4009400033829404, 5.2631858358383505, 3.6940428886490624, 5.083919331546345, 4.524812142398941, 4.779947162662417, 5.164793134896074, 5.5068506643569854, 5.918392201042219, 6.501654898194541, 5.876655001238472, 5.977616562547873, 7.891423363613533, 7.00059921967674, 7.345261291008892, 9.408266086765138, 7.583519299744305, 7.560352564334551, 8.480092448170442, 9.02574635310838, 8.674895637419873, 7.975998513672171, 9.115201377552355, 9.280047324495989, 11.06422276633347, 10.275862572249647, 9.611470453783129, 9.745091465664931, 9.637209933730054, 8.92423793908457, 8.412301814673198, 8.17984828828761, 8.739951099169165, 9.092181456915098, 8.783278811221368, 8.3250734565832, 8.465082731492016, 8.047097536673931, 7.7661564924289355, 7.859178115364764, 7.913021275327416, 7.833461364665232, 6.3679652044734745, 5.839993414664017, 9.380074123348182, 10.192073125065411, 10.004277816580815, 10.28771210169729, 10.30179071039181, 10.333958914386082, 10.027910116548775, 10.061094948386854, 10.486086600154065, 9.48709805506205, 9.498482818042122, 9.99872850077319, 11.143602521716774, 10.913713492401559, 10.673674914200625, 11.035165815859562, 11.347563138167903, 10.20117323239598, 10.421508351179757, 10.547745887038328, 11.011119022700193, 11.740992103697453, 11.884332094880364, 11.880818004458886, 10.428651605523816, 10.39030665414085, 10.224739074867372, 10.15926047990621, 10.092078679503913, 9.662622102533934, 11.917707095834345, 10.101617262813965, 9.937473953641756, 9.31923682643815, 8.683821336931665, 7.953315495409977, 7.975781748539447, 8.991703000870952, 8.571837713761065, 6.774729205337746, 6.333439600434547, 4.081313457342844, 3.5048801221111874, 3.6332536875994785, 3.7782071555204815, 3.3569974974995627, 3.1974384814036756, 3.006455493546556, 3.091846674957898, 3.1567902850128955, 3.904747134052315, 4.023525391675827, 2.757327381910293, 3.694434108106292, 3.7275870005714107, 4.365233588261924, 3.068204123491822, 4.54147334584293, 5.876446195622856, 5.535583199047384, 5.960310357055061, 5.867233239302969, 6.088550173050802, 5.485589378620765, 5.4031432984319325, 5.74617348169227, 6.597878206505014, 6.731712039812493, 6.544887448439576, 6.797766195635114, 8.688387592601346, 9.052946750580912, 9.488310373461402, 9.361871249884787, 9.473995773306564, 8.834451535713033, 8.818903584930068, 8.262648762419246, 8.486781740478541, 8.660433955485702, 9.070134869967669, 8.558114746927682, 8.934939489784545, 9.101596805746814, 9.017788781952126, 8.89186492115357, 8.847211645961698, 8.59415971262954, 7.68602536909674, 7.602057863394127, 7.390376087831878, 7.007669633944327, 7.192999864114965, 5.393098319885089, 5.436293612600677, 5.021132591816281, 4.904217466867245, 4.354898239138835, 4.598893487743081, 4.7427539552936615, 5.4516345622739415, 4.784493938384773, 4.4313972976093705, 4.246549604624997, 5.032953904277386, 4.8729376326004505, 4.19312199036495, 4.347310741964431, 3.9799018497723293, 3.545213911748308, 3.1441656333057337, 1.6710673285550783, 1.2154803458338301, 0.484131654126462, 0.4904799723085046, 0.7536412919255309, 1.4978019988361857, 1.528064479052527, 0.9332887119509145, 0.5178728726489601, -0.7937754352346824, -0.7747094270340428, -1.2804008995342302, -0.03941652715440247, -0.1071288636255187, 0.28316802612899145, 0.009873540621839372, -0.18052712419519942, 0.33372946594744046, 0.3147967187871846, 0.13195921883288828, 0.8130061715214906, -0.413383101571556, -1.0507620137489777, -1.3301568335283118, -1.6650455797751835, -2.0084650002873703, -0.845816924389502, -0.7378301002430014, 0.2816772585981657, 0.33726286262754596, -0.455478854829151, -0.7002100418167714, -0.7410928854978656, -0.7844330092450397, -0.49166328838108714, 0.20658312280441532, 0.5141991428435564, 0.5353636727820318, -0.5396535299453745, -0.47963190992180865, 0.05009453062227759, 3.068291341325825, 3.6707460088147195, 3.3924105962409428, 4.434075226765764, 4.094573593506336, 4.022460160006221, 4.606826116955755, 4.800548579381613, 5.080208409399184, 5.225162271695173, 6.112526423562661, 4.787976227921725, 3.935709505802243, 3.8866080583137355, 3.9759364543266114, 4.432950861585566, 4.521270970213329, 4.592874664643576, 4.401806203637866, 2.0709451087203847, 2.7133624716585683, 2.0554777882977744, 2.4314827724490997, 2.4289920586367835, 1.7672065596284647, 0.8684389413185885, 0.3519693011589893, -1.0098651458966388, -1.4954256541004902, -1.2774945975697234, -1.6170785898842008, -1.7816738668732706, -2.604453889432005, -1.8284655560050416, -1.826639103612653, -1.5727020465054564, -2.8115530157907704, -2.8064129724459503, -2.824756711167481, -2.633486448451128, -1.2894467930284994, -1.1252785304443105, 1.1615617960545013, -0.07501796792287463, 1.2180523689557123, 1.281370853481902, 0.6294118787235699, 0.47967998791830624, 0.3820670250868128, 1.761410215941598, 1.6988835423459665, 1.3914317957318256, 0.9932690831081681, 2.1216469383518355, 2.57830812810057, 1.5675038351517916, 1.499863741756488, 1.4797869969765909, 1.3962559839505777, 1.5003089627252606, 2.2577161460026973, 3.2500608429008544, 3.1719134402812483, 2.1280971716733705, 3.0911283233836926, 3.0739558393258957, 3.417909581919523, 3.1077434590400745, 3.0031731782859197, 3.3143608809733167, 3.4936949832901854, 3.350175675784567, 3.024661806236941, 3.350948951513038, 3.2661058173573836, 3.5717724238633544, 4.205560618966349, 3.3802442290648282, 3.326058155578964, 3.7076905291107147, 3.507197025626057, 3.258310395402929, 3.448890548871341, 3.5675123623721765, 3.6483946143679304, 6.0465554235175745, 6.727439779604503, 6.618648295855393, 6.417777164484391, 6.588068846707991, 6.7342778820871345, 6.740200423603985, 6.730480626911762, 6.483509674510692, 7.013371797011896, 7.3326656438954085, 7.796364181849844, 7.912086525324982, 8.248738724906623, 9.094670540818608, 10.938835172561514, 10.932046093029886, 11.032570641568443, 10.806366327712082, 10.253336237663182, 10.328181401125898, 10.10736019109859, 10.283208069343013, 9.427028620653962, 10.511609259007942, 10.376285748019635, 10.45994122486296, 10.598555468160418, 10.768787197087892, 10.734377460315851, 10.929396974191913, 11.24545441915919, 11.66380351088435, 10.2705938372149, 10.529482322567937, 9.65009718562421, 10.708708615261001, 10.579903752177515, 10.818947972172836, 12.75874333607987, 12.53200627239471, 13.448135199905753, 13.217531686129789, 12.636964108410984, 12.137901037623006, 11.86673691778073, 11.539369598626964, 12.120244195829795, 11.859120482692662, 12.14167175545455, 13.00612868906353, 13.124497489086544, 13.06281585224711, 13.345988568589465, 12.675430802061582, 12.698697075400288, 12.446467648281725, 12.471731315906645, 12.851548774216235, 12.78817035667456, 13.342522562136391, 13.30901396773242, 13.366327675891805, 14.06637719589249, 13.838815529699925, 16.16735158874443, 15.98828863739303, 16.604351617173595, 16.430310926790824, 15.354274096652077, 13.54388081259839, 13.46313352833355, 13.240839525290413, 12.682385145015067, 12.846268622415753, 12.672494237764031, 13.45909564778167, 13.092638898162472, 12.882171425084092, 13.532430878669553, 13.409807189924473, 13.125637629444626, 13.583457729676494, 13.035512174101004, 13.259672477033394, 13.673818102405425, 12.340114952160228, 12.93150772363514, 12.93531809575291, 13.028230242880133, 13.09637187271421, 13.02348430246701, 12.062486783820257, 11.159894633820835, 11.397051510441297, 11.198589463151317, 11.003479890046835, 12.733742128292166, 12.278001830895816, 13.659717805351706, 14.4295397150598, 14.156483209306614, 13.794074797735838, 14.30295364466324, 15.385086112410919, 14.789281837333153, 14.322320866070816, 13.420689442869074, 12.942173641594971, 13.887271581463956, 11.687614158755892, 11.012660920294312, 10.962601567496892, 11.060132077220404, 10.033927930364314, 9.585387226387422, 9.839438107888945, 9.661740502069776, 9.142973390983917, 9.17110769504404, 9.492070757935263, 9.495349857013569, 9.401657972388207, 9.659301316525577, 8.333316999954402, 8.506415765555287, 8.721506148642911, 7.656368939419082, 7.65591218797163, 7.887877507655221, 7.893606785156322, 8.250147214317446, 7.9106934245384855, 8.021596157384401, 7.908534940528423, 6.618774700170363, 6.054293664360004, 6.067120613103473, 5.848971889665193, 5.23356484653052, 4.857464602996261, 4.710947932606829, 5.688878159807495, 5.774700757993441, 5.960063409804809, 5.968430040867323, 6.1411753906067705, 6.566279180533796, 6.8132446147933186, 6.911085685627572, 7.092136450514407, 8.054548543618138, 8.079888339939636, 8.172788067257947, 7.710248978827342, 8.900926289661777, 8.788836940689118, 8.542324285673093, 8.541819343340128, 9.66240010430889, 9.416728774914702, 9.408176450174063, 8.638400084050012, 9.293933857190009, 7.9420636837798275, 8.239678223081047, 9.639249122480583, 9.27740697530612, 10.0120142902003, 9.555303166826649, 9.03740918496326, 8.095500464270811, 8.299207683524633, 8.189421751103865, 8.796244473057385, 9.212058667425177, 9.645177337796662, 9.971132325923591, 8.710708484589057, 8.531272665428846, 8.213503939011732, 8.460552688236355, 8.137128259983946, 8.133982866963484, 9.676297622602569, 9.41366567358376, 9.481955677498373, 8.957424031364067, 8.889000378905358, 8.750482645620595, 8.542015010181053, 8.63995392009657, 8.962832778085986, 7.205400399412741, 8.248318811182854, 7.953714860591692, 7.9720776488491145, 7.933776115742867, 8.162602063483725, 7.388289623810565, 7.031825358887812, 6.658032428592734, 7.42180744414505, 7.289924994254278, 6.431309295207729, 5.6042758809919055, 5.334290530254307, 5.206348579169304, 6.279578003620265, 5.3108298989708915, 3.7865171438974627, 3.3369518014136057, 3.608909959022585, 3.3551089682587154, 2.048531935724369, 1.8510276084278214, 1.6033020189325573, 2.1615203724875727, 2.230530811947338, 3.008681617617152, 2.8472270505461905, 2.8171574776389483, 2.783443023269088, 3.242533319623409, 3.4718467489762324, 3.5446819087418415, 3.5384529503158344, 3.1406079864838157, 3.243158829404458, 3.1116512171897366, 2.4787803536682294, 4.275171475334241, 3.8593257459365704, 4.446070093133802, 4.174146253092042, 4.767497841643598, 4.705541383968685, 4.428351768310857, 4.079532887899475, 4.742357655489002, 4.332522526456412, 4.578972194493667, 4.004413984911857, 4.026237344300774, 4.063649281318865, 4.451359903129296, 4.472062580447406, 4.4929361222342274, 3.1295418915543047, 2.5991948876171245, 2.669821569910565, 3.4023273786974246, 1.4529232095701852, 1.93710112799231, 1.3105582416451846, 2.0933647765166055, 2.346760294460194, 2.7176914621934603, 2.846809221274955, 2.860547448316424, 3.7688208441790474, 3.6524079150382254, 4.464193881085472, 4.317371714376236, 3.092388898730914, 2.7392597005442325, 2.66384183235607, 3.378470630151905, 2.874311321671506, 2.8772269419679635, 1.13316615737662, 1.3459767657274087, 2.0570687167551465, 1.9037466044411568, 2.042631357771505, 1.9134739430663301, -0.09004316805057133, -0.051522346525731524, -1.0656796669742727, -1.2275797433717672, -0.35135793820745864, 0.027166663270129676, 0.7258221440004886, 1.8746165267761383, 1.5849041219283508, 1.8100133991164218, 1.8079530508446393, 1.4987056758163415, 0.14170262192066096, 0.279529833937441, 2.2894714033103973, 2.737004117788209, 2.4660275048894715, 0.7695573024551949, 1.832945875250856, 0.4957530560473218, 1.095779042577551, 1.473089410369186, 1.7314450277393243, 1.6760068511043913, 2.038158192744631, 1.5636096447582393, 2.7800196297520623, 2.9186418858520824, 3.9992848566349037, 4.781027828829316, 4.86801589076902, 4.785342311755647, 4.858035349588982, 6.320244526185091, 5.865499116867027, 5.6999550217483295, 6.350060798254631, 6.395657788261199, 6.25608976584691, 5.064407302132615, 5.201995562350035, 4.787525585858909, 4.766249242175106, 4.87577396203098, 5.198775376208488, 4.992234212851081, 4.7655251765249425, 4.647542275039172, 6.191084396845719, 5.619006749625788, 6.241896735519885, 5.651772369296374, 5.526534745612598, 5.533688208437018, 5.72707388676444, 6.320311407630945, 6.167305548361592, 5.7995890522019, 5.756377824625224, 5.893003702361307, 6.50328377121947, 5.956591602796869, 6.176954218180549, 6.361319221077832, 6.86301508186442, 7.819456304371196, 7.407192490192209, 7.18209214338415, 7.03102324045708, 7.009748985918935, 5.983749181051273, 6.157066114363968, 6.1565912675061965, 8.698695934257632, 8.713536201603102, 8.592349617341839, 8.558672544738066, 8.5401696487749, 7.659295375693799, 7.6488517984386375, 8.193118831541895, 8.69907065812739, 8.297827996997373, 7.463900321306559, 7.2976961890676595, 7.783000082783338, 8.419471668649456, 8.248163233660872, 6.918179951165304, 7.715265041629622, 7.94050212306089, 7.962394995937507, 8.343853289754373, 7.8210963113741325, 7.43243507459785, 8.141598044145113, 8.252478414713705, 8.62769135907867, 9.311127275233694, 9.137859054487109, 7.873560601493974, 8.639533471422274, 8.471606161098526, 8.445972735461734, 8.481493456608336, 9.355822117162818, 9.350101725589287, 8.52297680558345, 8.458061193202049, 8.43871933097645, 8.498099361828523, 8.447878248057428, 8.932992921648204, 9.773301352243239, 9.784693971541945, 9.519551183610895, 8.672147240367952, 9.28413592594159, 9.176763942403657, 9.178901604073033, 8.94342759807217, 9.119184721292653, 9.058410338275792, 10.261640631473385, 10.113856618506357, 10.117333840883346, 10.145853519525884, 11.429413223711432, 12.303254740254289, 10.843266882320856, 9.569275722093824, 9.568655250632068, 10.643379505888749, 10.84595035285295, 10.982507536634877, 11.037847440648552, 11.257592576228165, 10.97399442705262, 9.988059755018599, 9.382166992476357, 9.626519098828998, 9.589321534490802, 9.020752337566774, 8.580916733824923, 8.775796908756742, 8.642122663634593, 7.68006247452631, 7.650461155213084, 7.655055372405809, 6.793337858647801, 6.2823870255867265, 7.970625774957379, 8.13353665379371, 8.876024387043415, 9.05264603580267, 9.351757550874796, 9.067855105113901, 8.965552875168896, 8.072288161116335, 8.371855384327224, 8.379762622446146, 9.650744841859545, 9.921211477406322, 10.208342372936203, 10.291689379661781, 10.246315887213727, 9.89375872112999, 10.248197528397561, 9.050379746094793, 7.795264171009908, 7.851664690315385, 9.778307231207847, 10.586861881647465, 11.23375397464874, 12.271299071764311, 12.20992400822294, 12.177845813265327, 12.65812758677824, 12.70025935389122, 12.698442260935995, 14.055199062444814, 15.26015408473002, 15.387858063094049, 15.044657779570136, 14.704894254452885, 14.10171669632741, 14.721298600165355, 14.530684797607016, 13.457540403974638, 13.328052186722337, 12.843336888527155, 12.24029785813803, 12.635293359158453, 12.62378205268512, 11.589204184325155, 12.598704477506027, 12.615030608883142, 13.108031878654934, 13.200254082597217, 13.066774576774591, 13.058983996776085, 12.617117623985703, 12.163445871482626, 12.237870176751336, 12.50557801975432, 12.422755293988837, 12.383536405671546, 12.378735329197085, 12.391593455567062, 12.172372751414022, 12.234263897175223, 12.049415498457552, 12.050572591551141, 12.387108808280065, 12.279514538546007, 12.33228168973493, 10.791910232866472, 10.61182627220551, 10.639445482809853, 11.717663230677918, 11.94889325798788, 12.562544048032866, 13.06802836200521, 12.025298770505223, 12.39952532529622, 12.737522162701632, 12.6549825512, 12.403209465843481, 13.058598216692381, 11.27197460634611, 10.158179005354265, 11.903730354826147, 11.23689192988655, 11.424458950369262, 11.546864413904391, 10.825607205708943, 11.027105649354796, 11.040422204365205, 11.614693575982326, 11.92450474013899, 13.823241935602088, 13.797185743670866, 13.961999856833158, 14.624449072403726, 14.974669305780889, 14.544515838539667, 13.203285395607399, 14.053368075628924, 14.725994051574947, 15.591754881003858, 15.524080183995888, 13.227090645362566, 13.404420612257804, 13.42918754162636, 12.728192625626896, 12.892304878690833, 12.53619439248407, 12.291857530683721, 12.243803040232917, 13.476854198418309, 13.064107135902356, 14.424767001719761, 14.344866840130763, 14.328249440635648, 13.866431345756373, 15.2309738597985, 15.319734745601789, 15.448806680556409, 15.645037001869461, 14.408368486113774, 13.169393736355527, 13.430408888317768, 13.71737903769801, 13.58274879000625, 13.809409479840042, 13.189897407304828, 13.151771045518549, 13.589997863500908, 12.725855984909748, 12.02598727643428, 11.980423244960607, 11.306998435216482, 11.484287339091285, 9.61060091214136, 9.613858890138971, 8.242023901120955, 8.331493576109812, 7.415431501631797, 7.309081732134906, 7.1585307689120015, 7.796048197113246, 7.39396250101025, 7.65593446156028, 7.674852814997055, 8.880153302084535, 8.744819309193417, 8.903454777565669, 9.821957931756057, 9.070728883066742, 9.545635816704145, 8.628144752833588, 8.484963391760717, 8.373061817754609, 7.943484552646395, 7.890078960419941, 7.266612523883637, 6.825909142763649, 6.469301704685124, 6.44287765291085, 6.577667575019605, 6.613194457021808, 7.148965804176693, 8.629312027258825, 8.678253111156886, 10.19401888681032, 10.970142236675086, 11.371677454948873, 11.714317097567633, 11.50920320395887, 12.235411803232306, 12.143027857877144, 11.586833886302447, 10.14975965669191, 10.56798105877849, 10.705763731687844, 10.273665428951837, 10.843062020359808, 11.415011449778621, 10.794128541959871, 9.792541915261383, 9.945635464805619, 9.996880334501421, 9.685816363788911, 10.927165425868797, 11.318718627379246, 11.597408422210025, 11.628158631753086, 12.002792362464874, 12.00570171683967, 11.097166816937193, 10.351201136066274, 10.314276690537879, 11.296090874076377, 11.010686004938124, 10.85768592320217, 10.002659308923766, 9.589761545701098, 9.28752473502791, 9.41548114448871, 9.294016790332003, 8.229252835773911, 6.985151667077617, 7.171819655867484, 7.4763470838579025, 7.030663847271689, 6.758858448578578, 5.723295895412426, 5.724146515039082, 5.6188106465918946, 5.647388591339155, 5.986476615376302, 7.106340041928712, 7.589002102608447, 6.548772199519848, 6.87089108505523, 7.054645318390441, 7.273555739647639, 8.038712061344848, 8.397538783473273, 7.616466263106771, 7.6249181041124725, 6.686036092095741, 7.803007944527527, 8.483042041689007, 8.3380330044928, 8.338679511735842, 8.831919537813972, 8.580181402490942, 7.111812658249697, 8.040875472770457, 8.072780032899114, 7.687772885629763, 6.848368312604782, 6.7564266613741975, 6.444899417918962, 5.531945184449832, 5.076629697050467, 5.0742815802335866, 5.308267119493014, 4.604256187266827, 4.280443617716194, 3.9528223608622195, 4.666996782919329, 5.958427287769767, 5.774729272499847, 5.758659433047384, 5.3364116937309065, 5.254699306481992, 5.346681303489041, 5.456614782426735, 5.687635205068701, 5.942887161672951, 4.809966710386114, 4.944364343814595, 5.716267558176945, 6.256974936855791, 5.986041550671131, 5.356825302676015, 6.313977457755918, 6.150140655163123, 6.266993106162178, 8.418948509254895, 8.487698415425877, 6.514811783794648, 6.507083927089929, 7.012542087865516, 7.385389418878905, 7.387383897869423, 7.840227626462081, 7.552046244092855, 8.050588455284954, 7.401235731848824, 7.697228981082299, 8.11420838758517, 8.246463513172143, 7.935678447726984, 8.136812361788614, 7.576060301455859, 7.558805531402896, 7.436615616171532, 7.128477720806716, 7.14268501021136, 6.718825778875261, 7.066332390277845};

    //[x. y. TIME, DATA]
    String Others = "32.75,126.0,2020-11-26T03:00:00,";

    public List makeData(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < dataList1200.length; i++) {
            list.add(Others + dataList1200[i]);
            //System.out.println(list.get(i));
        }
        return list;
    }
}
